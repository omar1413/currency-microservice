package com.omar.limits.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {

		private long minimum;
		private long maximum;
		
		public LimitsConfiguration() {}
		

		public LimitsConfiguration(Long minimum, Long maximum) {
			
			this.minimum = minimum;
			this.maximum = maximum;
		}


		public Long getMinimum() {
			return minimum;
		}

		public void setMinimum(Long minimum) {
			this.minimum = minimum;
		}

		public Long getMaximum() {
			return maximum;
		}

		public void setMaximum(Long maximum) {
			this.maximum = maximum;
		}
		
		
}
