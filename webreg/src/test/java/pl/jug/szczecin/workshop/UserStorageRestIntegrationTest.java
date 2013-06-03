//package pl.jug.szczecin.workshop;
//
//import javax.enterprise.inject.spi.BeanManager;
//import javax.inject.Inject;
//
//import org.jboss.arquillian.api.Deployment;
//import org.jboss.arquillian.testng.Arquillian;
//import org.jboss.shrinkwrap.api.ArchivePaths;
//import org.jboss.shrinkwrap.api.Archives;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.jboss.shrinkwrap.impl.base.asset.ByteArrayAsset;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import com.acme.ejb.GreetingManager;
//import com.acme.ejb.GreetingManagerBean;
//
////@Test(groups = "integration")
//public class UserStorageRestIntegrationTest extends Arquillian
//{
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return Archives.create("test.jar", JavaArchive.class)
//                .addClasses(
//                        GreetingManager.class,
//                        GreetingManagerBean.class)
//                .addManifestResource(
//                        new ByteArrayAsset("<beans/>".getBytes()),
//                        ArchivePaths.create("beans.xml"));
//    }
//
//    @Inject GreetingManager greetingManager;
//
//    @Inject BeanManager beanManager;
//
//    @Test
//    public void shouldBeAbleToInjectCDI() throws Exception {
//
//        String userName = "Devoxx";
//
//        Assert.assertNotNull(
//                beanManager,
//                "Should have injected manager");
//
//        Assert.assertEquals(
//                greetingManager.greet(userName),
//                "Hello " + userName);
//    }
//}