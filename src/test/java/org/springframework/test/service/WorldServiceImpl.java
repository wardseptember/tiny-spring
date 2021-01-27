package org.springframework.test.service;

/**
 * @author derekyi
 * @date 2020/12/6
 */
public class WorldServiceImpl implements WorldService {

	private String name;

	public WorldServiceImpl() {
	}

//	public WorldServiceImpl(String name) {
//		this.name = name;
//	}

	@Override
	public void explode() {
		System.out.println("The " + name + " is going to explode");
	}

	@Override
	public String getName() {
		return name;
	}

}
