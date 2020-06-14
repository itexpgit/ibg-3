/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.acku.ibg3.Ibg3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Uma
 */
public class Ibg3Test {
    Ibg3 ib;
    
    public Ibg3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       // stu = new Student();
    
        ib = new Ibg3();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
      public void testMainName() {
         ib.setMain("5 spice Lamb");
         assertEquals("5 spice Lamb",ib.getMain());
          ib.setNoodles("Hakka Noodles");
         assertEquals("Hakka Noodles",ib.getNoodles());
       }
    }