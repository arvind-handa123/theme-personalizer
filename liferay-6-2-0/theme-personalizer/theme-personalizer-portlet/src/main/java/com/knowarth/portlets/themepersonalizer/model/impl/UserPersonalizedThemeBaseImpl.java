package com.knowarth.portlets.themepersonalizer.model.impl;

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the UserPersonalizedTheme service. Represents a row in the &quot;KNOWARTH_UserPersonalizedTheme&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserPersonalizedThemeImpl}.
 * </p>
 *
 * @author Samir Bhatt
 * @see UserPersonalizedThemeImpl
 * @see com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme
 * @generated
 */
public abstract class UserPersonalizedThemeBaseImpl
    extends UserPersonalizedThemeModelImpl implements UserPersonalizedTheme {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user personalized theme model instance should use the {@link UserPersonalizedTheme} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserPersonalizedThemeLocalServiceUtil.addUserPersonalizedTheme(this);
        } else {
            UserPersonalizedThemeLocalServiceUtil.updateUserPersonalizedTheme(this);
        }
    }
}