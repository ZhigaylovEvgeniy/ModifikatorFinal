public final class ModifikatorFinal {//Не статический класс
    final int A;//Не статическое поле
    final int B;//Не статическое поле
    static final int C = 5;//статическое поле
    public ModifikatorFinal(final int A, final int B){//Конструктор Финал НЕМОЖЕТ,
        // а вот параметры конструктора Финальными могут быть
        this.A = A;
        this.B = B;
    }


    public final int methodA(final ModifikatorFinal C){//Метод может быть финальным, параметры тоже могут быть финальными
        final int A = 1;//Локальная переменная может быть Финальной
        return A;
    }

    public static final int methodB(final ModifikatorFinal C){
        final int B = 2;
        return B;
    }

}
