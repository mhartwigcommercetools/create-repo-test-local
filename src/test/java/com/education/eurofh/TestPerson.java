package com.education.eurofh;

import com.education.eurofh.util.Person;
import org.mockito.Mockito;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestPerson {

    @Test
    public void testCanOrganizePartyTogether() {

        // Two real persons
        Person personYoung = new Person("Tim", 15);
        Person personOld = new Person("Tom", 25);

        // A mock
        Person personMock = Mockito.spy(
                new Person("not real", 0)
        );
        Mockito.doReturn(true).when(personMock).isAdult();

        assertTrue(personMock.isAdult());
        assertTrue(personOld.canOrganizePartyTogether(personMock));
        assertFalse(personYoung.canOrganizePartyTogether(personMock));

    }
}
