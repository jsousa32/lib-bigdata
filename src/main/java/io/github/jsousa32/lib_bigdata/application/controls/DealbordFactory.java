package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.companies.controls.CompanyService;
import io.github.jsousa32.lib_bigdata.person.controls.PersonService;

/**
 * The Interface DealbordFactory
 *
 * @author João Lucas Silva de Sousa
 * @sincer 11/10/2024
 */
public interface DealbordFactory {

    CompanyService company();

    PersonService person();
}
