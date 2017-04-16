package Constructor;

public abstract class Query {
	 protected String query ="";
	    
	    public abstract void setWhere(String where);
	    public abstract void setFrom(String from);
	    public abstract String Execute();

}
