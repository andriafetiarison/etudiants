package dao;

public interface GenericDao<T> {
    public void inserer(T entity);
    
    public void modifier(T entity);
    
    public void supprimer(int id);
}
