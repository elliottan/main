package seedu.address.model.permission;

import java.util.HashSet;
import java.util.Set;

/**
 * Permissions available in the system, that can be assigned to individual users.
 */
public enum Permission {
    ADD_EMPLOYEE,
    REMOVE_EMPLOYEE,
    EDIT_EMPLOYEE,

    VIEW_EMPLOYEE_LEAVE,
    APPROVE_LEAVE,

    CREATE_PROJECT,
    VIEW_PROJECT,
    ASSIGN_PROJECT,

    CREATE_DEPARTMENT,
    ASSIGN_DEPARTMENT,

    ASSIGN_PERMISSION //Might need a superadmin permission to control this permission.
    ;

    /**
     * @return a set of permission that represent the permission an admin should have.
     */
    public Set<Permission> getAdminPreset() {
        Set<Permission> preset = new HashSet<>();
        preset.add(ADD_EMPLOYEE);
        preset.add(REMOVE_EMPLOYEE);
        preset.add(EDIT_EMPLOYEE);
        preset.add(VIEW_EMPLOYEE_LEAVE);
        preset.add(APPROVE_LEAVE);
        preset.add(CREATE_PROJECT);
        preset.add(VIEW_PROJECT);
        preset.add(CREATE_DEPARTMENT);
        preset.add((ASSIGN_DEPARTMENT));
        preset.add(ASSIGN_PERMISSION);
        return preset;
    }

    /**
     * @return a set of permission that represent the permission a manager should have.
     */
    public Set<Permission> getManagerPreset() {
        Set<Permission> preset = new HashSet<>();
        preset.add(ADD_EMPLOYEE);
        preset.add(REMOVE_EMPLOYEE);
        preset.add(EDIT_EMPLOYEE);
        preset.add(VIEW_EMPLOYEE_LEAVE);
        preset.add(APPROVE_LEAVE);
        preset.add(CREATE_PROJECT);
        preset.add(VIEW_PROJECT);
        preset.add(CREATE_DEPARTMENT);
        preset.add((ASSIGN_DEPARTMENT));
        return preset;
    }

    /**
     * @return a set of permission that represent the permission an employee should have.
     */
    public Set<Permission> getEmployeePreset() {
        Set<Permission> preset = new HashSet<>();
        return preset;
    }

}
