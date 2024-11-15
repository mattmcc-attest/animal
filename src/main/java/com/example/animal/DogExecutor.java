package com.example.animal;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DogExecutor implements ApplicationListener<ContextRefreshedEvent> {

  private final DogRepository dogRepository;

  public DogExecutor(DogRepository dogRepository) {
    this.dogRepository = dogRepository;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    // Works
    var dog = new Dog(null, "Bailey", Breed.BICHON_FRISE);
    dogRepository.save(dog);

    System.out.println("Dogs before null breed: " + dogRepository.findAll());

    // Does not work
    var dog2 = new Dog(null, "Milo", null);
    dogRepository.save(dog2);

    System.out.println("Dogs after null breed: " + dogRepository.findAll());
  }
}

