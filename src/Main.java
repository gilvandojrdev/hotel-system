public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Hotel[] vect = new Hotel[10];

        System.out.print("Quantos quartos serão reservados?");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quartoNumero = sc.nextInt();

            vect[quartoNumero] = new Hotel(name, email);
        }

        System.out.println();
        System.out.println("Quartos reservados: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
