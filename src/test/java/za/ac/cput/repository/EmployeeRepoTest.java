package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Employee;
import org.junit.jupiter.api.Test;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepoTest {
    private static EmployeeRepo repo = EmployeeRepo.getRepo();
    private static Employee employee = EmployeeFactory.createEmployee("888342717");

    @Test
    void a_create() {
        Employee created = repo.create(employee);
        assertEquals(employee.getEmployeeId(),created.getEmployeeId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Employee read = repo.read(employee.getEmployeeId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Employee updated = new Employee.Builder().copy(employee)
                .setEmployeeId("ch58972")
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repo.delete(employee.getEmployeeId());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repo.getAll());
    }
}