/** ProWashPackage.java
 *  This is a subclass of package
 *  Andrea Jacobs 218024266
 *  04 April 2023 */

package za.ac.cput.domain.packageoffered;

import java.util.Objects;

public class ProWashPackageOffered extends PackageOffered {
    private String packageId;
    private String packageName;
    private String packageDescription;
    private double packagePrice;

    private ProWashPackageOffered(Builder builder){
        super();
        //this.packageId = builder.packageId;
        this.packageName = builder.packageName;
        this.packageDescription = builder.packageDescription;
        this.packagePrice = builder.packagePrice;
    }

    @Override
    public String getPackageId() {
        return packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    @Override
    public String getPackageDescription() {
        return packageDescription;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProWashPackageOffered that = (ProWashPackageOffered) o;
        return Objects.equals(packageId, that.packageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), packageId);
    }

    @Override
    public String toString() {
        return "ProWashPackage{" +
                "packageId='" + packageId + '\'' +
                ", packageName='" + packageName + '\'' +
                ", packageDescription='" + packageDescription + '\'' +
                ", packagePrice=" + packagePrice +
                '}';
    }

    public static class Builder {
        private String packageId;
        private String packageName;
        private String packageDescription;
        private double packagePrice;

        public Builder setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackageDescription(String packageDescription) {
            this.packageDescription = packageDescription;
            return this;
        }

        public ProWashPackageOffered build() {
            return new ProWashPackageOffered(this);
        }

        public Builder setPackagePrice(double packagePrice) {
            this.packagePrice = packagePrice;
            return this;
        }

        public ProWashPackageOffered copy (ProWashPackageOffered proWashPackage) {
            this.packageId = proWashPackage.packageId;
            this.packageName = proWashPackage.packageName;
            this.packageDescription = proWashPackage.packageDescription;
            this.packagePrice = proWashPackage.packagePrice;
            return null;
        }
    }
}
