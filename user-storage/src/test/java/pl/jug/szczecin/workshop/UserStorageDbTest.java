package pl.jug.szczecin.workshop;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.jug.szczecin.workshop.entity.User;

import java.util.Random;

public class UserStorageDbTest extends Arquillian {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(UserStorage.class, UserStorageInMemory.class, User.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    UserStorage storage;

    @Test
    public void shouldInjectUserStorage() throws Exception {
        Assert.assertNotNull(storage);
    }
}
