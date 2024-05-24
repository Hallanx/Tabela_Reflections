public class Main {
    public static void main(String[] args) {
        if (MinhaClasse.class.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = MinhaClasse.class.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.valor());
        } else {
            System.out.println("A anotação Tabela não está presente na classe MinhaClasse.");
        }
    }
}
