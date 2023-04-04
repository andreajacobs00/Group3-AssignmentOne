/** Package.java
 *  This clas is a POJO class and super class
 *  Andrea Jacobs 218024266
 *  04 April 2023 */

package za.ac.cput.domain.packages;

import java.util.Objects;

public class Package {
    private String packageId;
    private String packageDescription;

    public Package() {}

    private Package(Builder builder) {
        this.packageId = builder.packageId;
        this.packageDescription = builder.packageDescription;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Objects.equals(packageId, aPackage.packageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId);
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId='" + packageId + '\'' +
                ", packageDescription='" + packageDescription + '\'' +
                '}';
    }

    public static class Builder {
        private String packageId;
        private String packageDescription;

        public Builder setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }

        public Builder setPackageDescription(String packageDescription) {
            this.packageDescription = packageDescription;
            return this;
        }

        public Package copy(Builder builder) {
            this.packageId = builder.packageId;
            this.packageDescription = builder.packageDescription;
            return null;
        }

        public Package build(Builder builder) {
            return new Package(this);

        }
    }
}
