package ca.krasnay.sqlbuilder;

/**
 * Predicate used to add an EXISTS clause to the where clause.
 *
 * @author <a href="mailto:john@krasnay.ca">John Krasnay</a>
 */
public interface ExistsPredicate extends Predicate {

    ExistsPredicate and(Predicate predicate);

    ExistsPredicate and(String predicate);

    ExistsPredicate join(String join);

    ExistsPredicate where(Predicate predicate);

    ExistsPredicate where(String predicate);

}
