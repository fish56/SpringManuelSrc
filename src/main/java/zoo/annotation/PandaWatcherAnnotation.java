package zoo.annotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import zoo.animal.Panda;

import javax.inject.Inject;

@Getter @Setter
@NoArgsConstructor
public class PandaWatcherAnnotation {
    private String name;

//    @Autowired
//    private Panda panda;

    @Inject
    private Panda panda;
}
