package entidades;

public enum Nota {
    C1("Excelente, tu rendimiento ha sido el mejor. : "),
    C2("Tu rendimiento es aceptable, pero finalizaste bien. : "),
    C3("Te sugerimos comprometerte más con tu estudio. : "),
    C4("Malas noticias, no cumpliste con el mínimo para avanzar. : "),
    C5("Nuevamente vuelve a iniciar tus estudios y dedícate. : ");


    private String msje;
    Nota(String s)
    {
        this.msje = s;
    }
    public String getMsje() {
        return msje;
    }
}
