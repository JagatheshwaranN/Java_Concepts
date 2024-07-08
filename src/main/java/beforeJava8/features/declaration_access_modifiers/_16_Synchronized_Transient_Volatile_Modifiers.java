package beforeJava8.features.declaration_access_modifiers;

public class _16_Synchronized_Transient_Volatile_Modifiers {

    public static void main(String[] args) {

        /*
            Synchronized Modifier
            =====================
            1. Synchronized is a modifier applicable for methods and blocks but not for classes
               and variables.

            2. If multiple threads trying to operate simultaneously on the same java object, then
               there may be chance of Data inconsistency problem. This is called as RACE condition.
               We can overcome this problem by using the Synchronized keyword. If a method or block
               is declared as synchronized, then at a time only one thread is allowed to execute that
               method/block on the given object so, the data inconsistency problem will be resolved.

            3. The main disadvantage of the synchronized keyword is, it increases the waiting time of
               the thread and creates performance problem. Hence, if there is no specific requirement
               it’s not recommended to use Synchronized.

            4. Synchronized method should compulsorily contain implementation whereas abstract method
               does not contain any implementation. Hence, Abstract Synchronized is illegal combination
               of modifiers for methods.
        */

        /*
            Transient Modifier
            ==================
            1. Transient is a modifier which is applicable only for variables. We can use transient
               keyword in the serialization context.

            2. At the time of serialization, if we don’t want to save the value of the variable to
               meet security then we should declare that variable as Transient. At the time of
               serialization, the JVM ignores the original values of the transient variable and save
               default value to the file. Hence, transient means not to serialize.

            3. Serialization - Saving the state of the object to the file.
               Deserialization - Retrieving the state of the object from the file.

            Example, saving the username and password, we have to use transient for password.
        */

        /*
            Volatile Modifier
            =================
            1. Volatile is a modifier which is applicable only for variables, and we can not apply
               anywhere else.

            2. If the value of the variable keeps on changing by multiple threads, then there may be
               a chance of Data inconsistency problem. We can solve this problem by using Volatile
               modifier.

            3. If a variable is declared as Volatile, then for every thread JVM will create a separate
               local copy, then every modification performed by thread will take place in local copy so
               there is no effect on the remaining threads.

            4. The main advantage of the Volatile keyword is we can overcome the Data inconsistency
               problem.

            5. The disadvantage of the Volatile keyword is creating and maintaining a separate copy for
               every thread increases the complexity of the programming and creates the performance problem.
               Hence, if there is no specific requirement, then its recommended not to use Volatile keyword
               and its almost deprecated keyword.

            6. Final variable means the value never changes whereas the volatile variable means the value
               keep on changing. Hence, the Volatile Final is illegal combination for Variables.
        */
    }
}
