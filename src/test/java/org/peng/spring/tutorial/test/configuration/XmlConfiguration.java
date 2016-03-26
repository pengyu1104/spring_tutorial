/**
 * 
 */
package org.peng.spring.tutorial.test.configuration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.peng.spring.tutorial.test.model.A;
import org.peng.spring.tutorial.test.model.A2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author carbonfish
 *
 */
public class XmlConfiguration {

	@Test
	public void useAXmlConfigFiles() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"org/peng/spring/test/config/spring.xml");
		assertEquals("org.peng.spring.tutorial.test.model.A", ((A) context.getBean("a")).getName());
	}

	@Test
	public void useMutipleXmlConfigFiles() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"org/peng/spring/test/config/spring.xml","org/peng/spring/test/config/spring2.xml");
		assertEquals("org.peng.spring.tutorial.test.model.A2", ((A2) context.getBean("a2")).getName());
	}
}
