public class FinalPernambucano extends SubClasseBrasileiro {
    public static void main(String[] args) {
        final String anoNascimento = "2020";
        SubClasseBrasileiro pernambucano = new SubClasseBrasileiro();
        pernambucano.setNome("Caio");
        System.out.println("O individuo " + pernambucano.getNome() + ", nasceu em " + anoNascimento + "no país " + pernambucano.PAIS + " e fala " + pernambucano.idioma());
    }
}
