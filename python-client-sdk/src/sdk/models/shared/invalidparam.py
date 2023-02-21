import dataclasses
from dataclasses_json import dataclass_json
from sdk import utils


@dataclass_json
@dataclasses.dataclass
class InvalidParam:
    r"""InvalidParam
    Information about an input parameter pass to the API call that could not be parsed.
    """
    
    data_type: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('dataType') }})
    input_cell_type: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('inputCellType') }})
    param_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('paramName') }})
    param_value: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('paramValue') }})
    