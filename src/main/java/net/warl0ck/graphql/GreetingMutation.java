package net.warl0ck.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingMutation implements GraphQLMutationResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting newGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return greetingRepository.save(greeting);
    }
}