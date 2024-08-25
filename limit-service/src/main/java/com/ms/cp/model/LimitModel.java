package com.ms.cp.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LimitModel {
	private int min;
	private int max;
}
