package kswelder.com.github.com.CheckList;

import kswelder.com.github.com.CheckList.gui.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class CheckListApplication {
	public static void main(String[] args) {
		var context = new SpringApplicationBuilder(
				Application.class).headless(false).run(args);

		EventQueue.invokeLater(() -> {
			var ex = context.getBean(Application.class);
		});
	}
}
