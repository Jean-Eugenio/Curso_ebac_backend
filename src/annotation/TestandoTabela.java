package annotation;

public class TestandoTabela {

    public static void usarTabela(Class<?> clazz) {
    if (clazz.isAnnotationPresent(Tabela.class)) {
        Tabela tabela = clazz.getAnnotation(Tabela.class);
        System.out.println("Tabela: " + tabela.valor());
    } else {
        System.out.println("A classe " + clazz.getSimpleName() + " não está anotada com @Tabela.");
    }
    }
    
    @Tabela(valor = "teste")
    public static class tabela {
    }
}