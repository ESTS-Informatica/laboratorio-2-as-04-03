

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    private Company company1 = null;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        if(company1 != null) {
            User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
            User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
            User seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
            User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
            company1.registerClient(client1);
            company1.registerClient(client2);
            company1.registerSeller(seller1);
            company1.registerSeller(seller2);
        }
    }
    
    @Test 
    public void testConstructor() {
        company1 = new Company();
    }

    @Test
    public void testRegisterClient() {
        company1 = new Company();
        User client1 = new User("João Malaquias", "977777777", "jm@gmail.com");
        assertTrue(company1.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients() {
        company1 = new Company();
        User client1 = new User("João Malaquias", "977777777", "jm@gmail.com");
        User client2 = new User("João Pedro", "977767777", "jp@gmail.com");
        assertTrue(company1.registerClient(client1) && company1.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate() {
        company1 = new Company();
        User client1 = new User("João Malaquias", "977777777", "jm@gmail.com");
        company1.registerClient(client1);
        assertFalse(company1.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull() {
        company1 = new Company();
        assertFalse(company1.registerClient(null));
    }
    
    @Test
    public void testRegisterSeller() {
        company1 = new Company();
        User seller1 = new User("João Malaquias", "977777777", "jm@gmail.com");
        assertTrue(company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellers() {
        company1 = new Company();
        User seller1 = new User("João Malaquias", "977777777", "jm@gmail.com");
        User seller2 = new User("João Pedro", "977767777", "jp@gmail.com");
        assertTrue(company1.registerSeller(seller1) && company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerDuplicate() {
        company1 = new Company();
        User seller1 = new User("João Malaquias", "977777777", "jm@gmail.com");
        company1.registerSeller(seller1);
        assertFalse(company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNull() {
        company1 = new Company();
        assertFalse(company1.registerSeller(null));
    }
       
    @Test
    public void testRegisterProperty() {
        company1 = new Company();
        Property p = new Property("Casa", 1.0);
        assertTrue(company1.registerProperty(p));
    }
    
    @Test
    public void testRegisterProperties() {
        company1 = new Company();
        Property p = new Property("Casa", 1.0);
        Property p1 = new Property("Banco", 6.0);
        assertTrue(company1.registerProperty(p) && company1.registerProperty(p1));
    }
    
    @Test
    public void testRegisterPropertyDuplicate() {
        company1 = new Company();
        Property p1 = new Property("Banco", 6.0);
        company1.registerProperty(p1);
        assertFalse(company1.registerProperty(p1));
    }
    
    @Test
    public void testRegisterPropertyNull() {
        company1 = new Company();
        assertFalse(company1.registerProperty(null));
    }
    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
