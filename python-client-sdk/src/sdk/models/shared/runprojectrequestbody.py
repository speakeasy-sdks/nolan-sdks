import dataclasses
from dataclasses_json import dataclass_json
from sdk import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class RunProjectRequestBody:
    r"""RunProjectRequestBody
    Request body format for triggering a project run
    """
    
    dry_run: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('dryRun') }})
    input_params: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('inputParams') }})
    update_cache: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('updateCache') }})
    