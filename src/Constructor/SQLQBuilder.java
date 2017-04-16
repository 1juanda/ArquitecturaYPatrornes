package Constructor;

public class SQLQBuilder implements QBuilder {
	Query myQuery;

	@Override
	public void build() {
		// TODO Auto-generated method stub
		myQuery = new SQLQuery();
	}

	@Override
	public void setwhere(String where) {
		// TODO Auto-generated method stub
		myQuery.setWhere(where);
	}

	@Override
	public void setfrom(String From) {
		// TODO Auto-generated method stub
		myQuery.setFrom(From);
		
	}

	@Override
	public Query getResultado() {
		// TODO Auto-generated method stub
		return myQuery;
	}
	
}
