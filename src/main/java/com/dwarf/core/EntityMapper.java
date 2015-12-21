package com.dwarf.core;

import java.io.IOException;

public interface EntityMapper {

	public String mapToString(Object object) throws IOException;
	
	public <T> T mapToObject(String source, Class<T> clazz) throws IOException;

}