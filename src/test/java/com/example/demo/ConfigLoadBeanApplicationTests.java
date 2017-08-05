package com.example.demo;

import com.example.demo.bean.CDPlayer;
import com.example.demo.bean.CompactDisc;
import com.example.demo.config.CDConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
//@SpringBootTest
@ContextConfiguration(classes = CDConfiguration.class)
public class ConfigLoadBeanApplicationTests {
	@Autowired
	private CompactDisc compactDisc;

	@Autowired
	private CDPlayer cdPlayer;

	@Test
	public void bean_have_been_load() {
		assertThat(compactDisc).isNotNull();
		assertThat(cdPlayer).isNotNull();
	}


}
