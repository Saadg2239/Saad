package Utils.DataModels;

public class TypePropertyFormats {
    private static final String[] invalidEmailFormats = {
            "example.com",  // Missing @ symbol
            "@example.com", // Missing username
            "example@",  // Missing domain
            "example@example", // Missing top-level domain
            "example@exa$mple.com", // Invalid characters
            "example @example.com, example@ example.com, example @ example.com", // Spaces
            "@", // Missing local part and domain
            "example@example@example.com", // Multiple @ symbols
             "example@exa..mple.com", // Consecutive dots
             "example@example.com.", // Trailing dot
             ".example@example.com", // Leading dot
    };
    private static final String[] invalidUrlFormats = {
            "http:/example.com", // Missing one slash in protocol
            "http:///example.com", // Extra slash in protocol
            "htp://example.com", // Incorrect protocol
            "http://example", // Missing top-level domain
            "http://.com", // Missing domain name
            "http://example..com", // Consecutive dots in domain name
            "http://example.com/a<", // Invalid characters in URL
            "http://example.com/a%", // Invalid characters in URL
            "http://example.com/a[", // Invalid characters in URL
            "http://example.com/a^", // Invalid characters in URL
            "http://example.com/a`", // Invalid characters in URL
            "http://example.com/a{", // Invalid characters in URL
            "http://example.com/a|", // Invalid characters in URL
            "http://example.com/a}", // Invalid characters in URL
            "http://example.com/a~", // Invalid characters in URL
            "http://example.com/a<", // Invalid characters in URL
            "http://example.com/a>", // Invalid characters in URL
            "http://example.com/a#", // Invalid characters in URL
    };
    private static final String[] invalidNumericFormats = {
            "123abc", // Alphabetic characters in a numeric string
            "123.45.67", // More than one decimal point
            "123..45", // Consecutive decimal points
            "123.", // Trailing decimal point
            ".123", // Leading decimal point
            "123 456", // Spaces in a numeric string
            "123,456", // Commas in a numeric string
            "123-456", // Hyphen in a numeric string
            "123/456", // Slash in a numeric string
            "123%456", // Percentage sign in a numeric string
            "123$456", // Dollar sign in a numeric string
            "123@456", // At sign in a numeric string
            "123#456", // Hash sign in a numeric string
            "123^456", // Caret in a numeric string
            "123&456", // Ampersand in a numeric string
            "123*456", // Asterisk in a numeric string
            "123(456", // Open parenthesis in a numeric string
            "123)456", // Close parenthesis in a numeric string
            "123=456", // Equals sign in a numeric string
            "123+456", // Plus sign in a numeric string
    };
    private static final String[] invalidAlphanumericFormats = {
            "abc!", // Special characters in an alphanumeric string
            "abc@def", // Special characters in an alphanumeric string
            "abc#def", // Special characters in an alphanumeric string
            "abc$def", // Special characters in an alphanumeric string
            "abc%def", // Special characters in an alphanumeric string
            "abc^def", // Special characters in an alphanumeric string
            "abc&def", // Special characters in an alphanumeric string
            "abc~def", // Special characters in an alphanumeric string
            "abc*def", // Special characters in an alphanumeric string
            "abc(def", // Special characters in an alphanumeric string
            "abc)def", // Special characters in an alphanumeric string
            "abc=def", // Special characters in an alphanumeric string
            "abc+def", // Special characters in an alphanumeric string
            "abc-def", // Special characters in an alphanumeric string
            "abc_def", // Special characters in an alphanumeric string
    };

    private static final String[] invalidAlphabeticFormats = {
            "123", // Numeric characters in an alphabetic string
            "abc123", // Numeric characters in an alphabetic string
            "abc def123", // Numeric characters in an alphabetic string
            "abc!", // Special characters in an alphabetic string
            "abc@def", // Special characters in an alphabetic string
            "abc#def", // Special characters in an alphabetic string
            "abc$def", // Special characters in an alphabetic string
            "abc<def", // Special characters in an alphabetic string
            "abc>def", // Special characters in an alphabetic string
            "abc,def", // Special characters in an alphabetic string
            "abc.def", // Special characters in an alphabetic string
            "abc`def", // Special characters in an alphabetic string
            "abc~def", // Special characters in an alphabetic string
            "abc!def", // Special characters in an alphabetic string
            "abc@def", // Special characters in an alphabetic string
            "abc#def", // Special characters in an alphabetic string
            "abc$def", // Special characters in an alphabetic string
    };


    public static String[] getInvalidAlphabeticFormats() {
        return invalidAlphabeticFormats;
    }
    public static String[] getInvalidAlphanumericFormats() {
        return invalidAlphanumericFormats;
    }

    public static String[] getInvalidNumericFormats() {
        return invalidNumericFormats;
    }

    public static String[] getInvalidUrlFormats() {
        return invalidUrlFormats;
    }

    public static String[] getInvalidEmailFormats() {
        return invalidEmailFormats;
    }
}
