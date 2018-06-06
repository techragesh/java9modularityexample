# java9modularityexample
This project shows how to use modularity in java9

### Modules ###
Modularization is the act of decomposing a system into self contained modules. 
It possibly makes you think of component-based development.

### Java9 modules ###

* Reliable Configuration
  
    - The system checks all dependencies before compiling or running code.
    
* Strong Encapsulation 

    - Modules explicitly choose what to expose to other modules.
    
* Modular JDK/JRE

### Demo ###

In this project, I have created three modules.

    * bankmodule
    * insurancemodule
    * overallmodule
    
Each module has unique module-info.java. We can call the packages (in same module) using **_export_** keyword or we call other modules using **_requires_** keyword in module-info.java

In bankmodule, I created module-info.java under src folder like this.
I exported the bankmodule package here

```
module bankmodule {
    exports com.techjava.bank;
}

```
Similarly I have done for insurance module like this

```
module insurancemodule{
    exports com.techjava.insurance;
}

```
I have included bankmodule and insurancemodule in overallmodule like this

```
module overallmodule {
    requires bankmodule;
    requires insurancemodule;
}

```
Now you can able to call any module from main class.

**_Main Method:_**

```
package com.techjava.overall;

import com.techjava.bank.BankDetails;
import com.techjava.insurance.InsuranceDetails;

public class Overall {

    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.view();

        InsuranceDetails insuranceDetails = new InsuranceDetails();
        insuranceDetails.view();
    }
}

```
**_Output:_**
    
Bank Details
Insurance Details

### Points to remember ###

    * requires keyword indicates a dependency.
    
    * exports keyword only export defined package to other modules. 
    
    * Modules name must be a unique.
    
    * Module descriptor always start with module keyword.
    
    * The implicit dependency java.base automatically added to a module descriptor. 
    
    * Only explicitly exported packages can be access from other modules.
    
    * Modules dependencies are not transitive.


### Happy Coding ###


