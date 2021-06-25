package Dev.Casestudy.FishBar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dev.casestudy.fishbar.entity.Fish;
import dev.casestudy.fishbar.service.FishService;

import static org.junit.jupiter.api.Assertions.*;

public class FishServiceTest {
@Autowired
FishService  fservice;

@Test
void testCreate() {
	Fish fish = new Fish();
	fish.setColor("Blue");
	fish.setHabitat("Grassy");
	fish.setSize(100);
	fish.setName("Bass");
	
	fservice.save(fish);
	assertNotNull(fish.getId());
}

}
