public class Main {
    public static void main(String[] args) {
        ModifikatorFinal Z = new ModifikatorFinal(6,7);
        System.out.println(Z.A);
        //Z.A = 8;//Мы не можем изменить финальные параметры, они вводятся один раз
    }
}
