package junseok.rest.demoinflearnrestapi.events;

import org.junit.Test;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkTest {


    @Test
    public void nothing() {

//        UriComponents uriComponents = UriComponentsBuilder.newInstance()
//                .scheme("http").host("www.baeldung.com").path("/junit-5").build();

        UriComponents uriComponents = UriComponentsBuilder.fromUriString("docs")
                .build();


        assertThat(uriComponents.getPath()).isEqualTo("docs");
    }
}
