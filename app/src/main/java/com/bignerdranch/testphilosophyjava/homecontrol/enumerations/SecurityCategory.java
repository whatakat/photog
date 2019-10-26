package com.bignerdranch.testphilosophyjava.homecontrol.enumerations;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public enum SecurityCategory {
    STOK(Security.Stock.class), BOND(Security.Bond.class);
    Security[] values;
    SecurityCategory(Class<? extends Security> kind){
        values = kind.getEnumConstants();
    }
    interface Security{
        enum Stock implements Security{SHORT, LONG, MARGIN}
        enum Bond implements Security{MUNICIPAL, JUNK}
    }
    public Security randomSelection(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            SecurityCategory category =
                    Enums.random(SecurityCategory.class);
            print(category + ": "+category.randomSelection());

        }
    }
}
