/** IRepository.java
 *  This is the repository interface
 *  Andrea Jacobs 218024266
 *  09 April 2023 */

package za.ac.cput.repository.packageoffered;

public interface IRepository <T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
