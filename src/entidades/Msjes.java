package entidades;

public enum Msjes {
    MSJE_S("Ingresa la nota del seguimiento"),
    MSJE_P("Ingresa la nota del parcial"),
    MSJE_F("ingresa la nota del examen final");

    private String msje;
    Msjes(String s)
    {
        this.msje = s;
    }

    public String getMsje(){
        return msje;
    }
}
