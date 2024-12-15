package annotation;

public class App {
    public static void main(String[] args) {
        Class<?> clazz = TestandoTabela.tabela.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.valor());
        }

        TestandoTabela.usarTabela(TestandoTabela.tabela.class);
    }
}
