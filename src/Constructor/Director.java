package Constructor;

public class Director {
    public Query Build(String where, String from, QBuilder builder){
        builder.build();
        builder.setwhere(where);
        builder.setfrom(from);
       
        return builder.getResultado();
    }
}
