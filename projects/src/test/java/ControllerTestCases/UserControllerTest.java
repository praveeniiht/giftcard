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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import com.examples.projects.controller.HomeController;
import com.examples.projects.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	@org.mockito.InjectMocks
	private HomeController userController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		System.out.println("Before Every method....");
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@Test
	public void testHomePage() throws Exception {
	this.mockMvc.perform(get("/validateUsers")).andExpect(status().isOk()).
		andExpect(view().name("home"));
	}

	@Test
	public void testredirectHomePage() throws Exception {
	this.mockMvc.perform(get("/insertUser")).andExpect(status().isOk())
		.andExpect(view().name("home"));
	}
	
	@Test
	public void testgiftorder() throws Exception {
	this.mockMvc.perform(get("/newOrder")).andExpect(status().isOk())
		.andExpect(view().name("newgiftorder"));
	}
	@Test
	public void testplacetorder() throws Exception {
	this.mockMvc.perform(get("/newOrder")).andExpect(status().isOk())
		.andExpect(view().name("orderconfirm"));
	}
	@Test
	public void testlogout() throws Exception {
	this.mockMvc.perform(get("/logout")).andExpect(status().isOk())
		.andExpect(view().name("home"));
	}
		
}
