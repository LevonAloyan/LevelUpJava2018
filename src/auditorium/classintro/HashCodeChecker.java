package auditorium.classintro;

class HashCodeChecker {
		public static void main(String[] args) {
			for (long i = 0; i < 1000000000000000000l; i++) {
				Object object = new Object();
				int hashCode =
					Integer.parseInt(object.toString()
						.substring(object.toString().indexOf('@') + 1), 16);
				int hashCodeByMethod = object.hashCode();
				if (hashCode != hashCodeByMethod) {
					throw new RuntimeException("Hash codes are not equal");
				}
			}

			System.out.println("Object Hash code is reference address");


		}
	}
