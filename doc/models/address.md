
# Address

The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).

## Structure

`Address`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Optional | The first line of the address, such as number and street, for example, `173 Drury Lane`. Needed for data entry, and Compliance and Risk checks. This field needs to pass the full address.<br><br>**Constraints**: *Maximum Length*: `300` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | The second line of the address, for example, a suite or apartment number.<br><br>**Constraints**: *Maximum Length*: `300` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AdminArea2` | `String` | Optional | A city, town, or village. Smaller than `admin_area_level_1`.<br><br>**Constraints**: *Maximum Length*: `120` | String getAdminArea2() | setAdminArea2(String adminArea2) |
| `AdminArea1` | `String` | Optional | The highest-level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. This data is formatted for postal delivery, for example, `CA` and not `California`. Value, by country, is:<ul><li>UK. A county.</li><li>US. A state.</li><li>Canada. A province.</li><li>Japan. A prefecture.</li><li>Switzerland. A *kanton*.</li></ul><br><br>**Constraints**: *Maximum Length*: `300` | String getAdminArea1() | setAdminArea1(String adminArea1) |
| `PostalCode` | `String` | Optional | The postal code, which is the ZIP code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).<br><br>**Constraints**: *Maximum Length*: `60` | String getPostalCode() | setPostalCode(String postalCode) |
| `CountryCode` | `String` | Required | The [2-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote><br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |

## Example (as JSON)

```json
{
  "address_line_1": "address_line_18",
  "address_line_2": "address_line_28",
  "admin_area_2": "admin_area_22",
  "admin_area_1": "admin_area_14",
  "postal_code": "postal_code0",
  "country_code": "country_code8"
}
```

