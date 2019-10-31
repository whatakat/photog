package com.bignerdranch.testphilosophyjava.homecontrol.annotations;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.MethodDeclaration;
import com.sun.mirror.declaration.Modifier;
import com.sun.mirror.declaration.ParameterDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class InterfaceExtractorProcessor implements AnnotationProcessor {
    private final AnnotationProcessorEnvironment env;
    private ArrayList<MethodDeclaration> interfaceMethod =
            new ArrayList<MethodDeclaration>();
    public InterfaceExtractorProcessor(
            AnnotationProcessorEnvironment env){this.env = env;}
            public void process(){
        for (TypeDeclaration typeDecl: env.getSpecifiedTypeDeclarations()){
            ExtractInterface annot =
                    typeDecl.getAnnotation(ExtractInterface.class);
            if(annot == null)
                break;
            for (MethodDeclaration m: typeDecl.getMethods())
                if (m.getModifiers().contains(Modifier.PUBLIC)&&
                !(m.getModifiers().contains(Modifier.STATIC)))
                    interfaceMethod.add(m);
                if (interfaceMethod.size()>0){
                    try {
                        PrintWriter writer =
                                env.getFiler().createSourceFile(annot.value());
                        writer.println("package "+
                                typeDecl.getPackage().getQualifiedName()+";");
                        writer.println("public interface "+
                                annot.value()+"{");
                        for (MethodDeclaration m: interfaceMethod){
                            writer.print(" public ");
                            writer.print(m.getReturnType()+" ");
                            writer.print(m.getSimpleName()+" (");
                            int i = 0;
                            for(ParameterDeclaration parm:
                            m.getParameters()){
                                writer.print(parm.getType()+" "+
                                        parm.getSimpleName());
                                if (++i<m.getParameters().size())
                                    writer.print(", ");
                            }
                            writer.print(");");
                        }
                        writer.print("}");
                        writer.close();
                    }catch (IOException ioe){
                        throw new RuntimeException(ioe);
                    }
                }
        }
            }
}
