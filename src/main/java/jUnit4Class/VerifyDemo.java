package jUnit4Class;

import java.lang.reflect.*;

class VerifyDemo{
	public static void main(String[] args) throws 	ClassNotFoundException,
													IllegalAccessException,
													InvocationTargetException
	{
		@SuppressWarnings("rawtypes")
		Class clazz = Class.forName("jUnit4Class.Pupil");

		Pupil pupil = new Pupil();

		for ( Method method : clazz.getMethods()  ) {
			Verify v = method.getAnnotation(Verify.class);
			if(v != null) {
				Object result = method.invoke(pupil);
				if (  (Boolean)result == true  ) {
					System.out.println(method.getName() + " passed.");
				}else {
					System.out.println(method.getName() + " failed.");
				}
			}
		}
	}
}
