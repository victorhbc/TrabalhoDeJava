class TesterControladorDeLetrasJaDigitadas{

    public static void main(String[] args) {
        try {
            ControladorDeLetrasJaDigitadas c1 = new ControladorDeLetrasJaDigitadas();

            if (c1.isJaDigitada(' '))
                System.out.println("letra já digitada");
            else
                System.out.println("Letra não digitada");

            //Teste do método registreUmErro

        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            ControladorDeLetrasJaDigitadas c2 = new ControladorDeLetrasJaDigitadas();
            ControladorDeLetrasJaDigitadas c3 = new ControladorDeLetrasJaDigitadas();

            if (c2.equals(c3))
                System.out.println("iguais");
            else
                System.out.println("Diferentes");

            //Teste do método Equals

        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            ControladorDeLetrasJaDigitadas c4 = new ControladorDeLetrasJaDigitadas();
            System.out.println(c4.hashCode());

            //Teste do método hashCode

        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        try {
            ControladorDeLetrasJaDigitadas c5 = new ControladorDeLetrasJaDigitadas();
            ControladorDeLetrasJaDigitadas c6 = new ControladorDeLetrasJaDigitadas (c5);

            if(!c5.equals(c6))
                System.out.println("Não são iguais, o que prova que o construtor de cópias, copia o objeto e não apenas aponta para o objeto referenciado");
            else 
                System.out.println("nada foi alterado no objeto copaiado e nem no criado a partir da cópia porém, são objetos diferentes");

            //Teste do Método ConstrutorDeErros - que é o construtor de cópias

        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
        
        try {
            ControladorDeLetrasJaDigitadas c7 = new ControladorDeLetrasJaDigitadas();
            ControladorDeLetrasJaDigitadas c8 = (ControladorDeLetrasJaDigitadas) c7.clone();

             if(!c7.equals(c8))
                System.out.println("Não são iguais, o que prova que o construtor de cópias, copia o objeto e não apenas aponta para o objeto referenciado");
            else 
                System.out.println("nada foi alterado no objeto copaiado e nem no criado a partir da cópia porém, são objetos diferentes");

            //Teste do Método Clone
        
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

}