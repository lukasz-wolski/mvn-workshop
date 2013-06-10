package pl.jug.szczecin.workshop;

import javax.inject.Inject;

import org.assertj.core.api.Assertions;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.osgi.repository.core.MavenArtifactProvider;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependency;
import org.jboss.shrinkwrap.resolver.impl.maven.MavenBuilderImpl;
import org.jboss.shrinkwrap.resolver.impl.maven.MavenRepositorySystem;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.jug.szczecin.workshop.entity.User;

import java.util.Random;

public class UserStorageDbTest extends Arquillian {

    @Deployment
    public static JavaArchive createDeployment() {
        boolean recursively = true;

        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(UserStorage.class, UserStoragePersistent.class, User.class)
                .addPackages(recursively, "org.assertj")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    UserStorage storage;

    @Test
    public void shouldInjectPersistentUserStorage() throws Exception {
        // Given

        // When

        // Then
        Assert.assertNotNull(storage);
        Assertions.assertThat(storage).isExactlyInstanceOf(UserStoragePersistent.class);
    }
}
