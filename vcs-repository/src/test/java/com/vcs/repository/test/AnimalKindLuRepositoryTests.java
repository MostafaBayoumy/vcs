package com.vcs.repository.test;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vcs.model.AnimalKindLu;
import com.vcs.repository.AnimalKindLuRepository;

/**
 * @author Mostafa.Bayoumy
 * @createdOn Jul 15, 2020 - 4:15:07 PM
 * 
 */
@SpringBootTest(classes=com.vcs.repository.test.main.RepositoryTestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(false)
public class AnimalKindLuRepositoryTests {

	@Autowired
	private AnimalKindLuRepository animalKindLuRepository;

	private AnimalKindLu animalKindLu;

	@Before
	public void init() {
		Assert.assertNotNull(animalKindLuRepository);
		animalKindLu = new AnimalKindLu();
		animalKindLu.setCode("FISH");
		animalKindLu.setDesc("Fish");
	}

    @Test(expected = org.springframework.dao.DataIntegrityViolationException.class)
	public void testSave() {
		// first save
		animalKindLu = animalKindLuRepository.save(animalKindLu);
		Assert.assertNotNull(animalKindLu.getId());
	}
	
    @Test(expected = org.springframework.dao.DataIntegrityViolationException.class)
	public void testUniqueCode() {
    	// make sure that duplicate codes are not allowed 
		animalKindLu = animalKindLuRepository.save(animalKindLu);
	}
    
    @Test
	public void testUpdate() {
    	animalKindLu = animalKindLuRepository.getOne(1);
    	animalKindLu.setCode("AMPHIBIANS");
    	animalKindLu.setDesc("Amphibians");
		animalKindLu = animalKindLuRepository.save(animalKindLu);
		Assert.assertEquals(animalKindLu.getCode(), "AMPHIBIANS");
	}
	
    @Test
    public void testFindById() {
    	animalKindLu = animalKindLuRepository.getOne(6);
    	Assert.assertEquals(animalKindLu.getId(), new Integer(6));
    }
    
    @Test(expected= org.springframework.dao.EmptyResultDataAccessException.class)
	public void testDelete() {
		animalKindLuRepository.deleteById(8);
		animalKindLuRepository.getOne(8);
	}
    
	
}
