/*
Author@ Joshua Edward Nolte _ 219342717
 Interface Repository
 */
package za.ac.cput.repository;


public interface IRepository<T, ID> {
    T create(T t) ;
    T read(ID id );

public interface IRepository <T, ID>{

    T create(T t);
    T read(ID id);

    T update(T t);
    boolean delete(ID id);
}
