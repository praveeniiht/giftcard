package ControllerTestCases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.examples.projects.controller.HomeController;
import com.examples.projects.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	private MockMvc mockMvc;
	
	@Mock
	private UserService userService;

	@org.mockito.InjectMocks
	private HomeController homeController;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
	}
	
	@Test
	public void testLoadingPageUrl() throws Exception {
		//this.mockMvc.perform(get("/")).andExpect(status().isOk());
	}

	
}
