package Constructor;

public class SQLQuery extends Query{
	 @Override
	    public void setWhere(String where) {
	        super.query=super.query+" " + where;
	    }

	    @Override
	    public void setFrom(String From) {
	        super.query=super.query+" " + From;
	    }

	    @Override
	    public String Execute() {
	        return "Execute SQLQuery " + super.query;
	    }

}
